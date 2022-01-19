//cards 배열을 받으면 해당 배열의 3개의 숫자 합들 중 소수의 개수를 return
// 예시 [1,2,3,4] -> 총 나올 수 있는 합의 조합 -> [6,7,8,9]
// 이 중 소수(prime number)의 개수는 1개


function boringBlackjack(cards) {
    // 조합을 구해서 나올 수 있는 숫자들을 저장 getCombinations
    // 숫자들 중에서 소수인 것만 개수 구하기 isPrime
  
    let combinations = [];
    // for(let i=0;i<cards.length;i++){
    //   for(let j=0;j<cards.length;j++){
    //     for(let k=0;k<cards.length;k++){
    //       cards[]
    //     }
    //   }
    // }
    const getCombinations = function (arr, selectNumber) {
      const results = [];
      if (selectNumber === 1) return arr.map((el) => [el]); 
      // n개중에서 1개 선택할 때(nC1), 바로 모든 배열의 원소 return
  
      arr.forEach((fixed, index, origin) => {
        const rest = origin.slice(index + 1); 
        // 해당하는 fixed를 제외한 나머지 뒤
        const combinations = getCombinations(rest, selectNumber - 1); 
        // 나머지에 대해서 조합을 구한다.
        const attached = combinations.map((el) => [fixed, ...el]); 
        //  돌아온 조합에 떼 놓은(fixed) 값 붙이기
        results.push(...attached); 
        // 배열 spread syntax 로 모두다 push
      });
  
      return results; // 결과 담긴 results return
    }
    let result = getCombinations(cards,3);
    let getSum = [];
    
    result.map((el) => {
      let sum = 0;
      for(let i=0;i<el.length;i++){
        sum += el[i];
      }
      getSum.push(sum);
      return sum;
    })
    //result = [[6],[7],[8],[9]]
    //[6,7,8,9]
    //[]
    //let beforePrime = [...result];
  
    function isPrime(num) {
    if(num === 2)
    return true;
  
    for(let i = 2; i<num; i++){
      if(num % i === 0){
        return false;
      }
    }
    return true;
  }
  let count = 0;
  
    for(let i=0;i<getSum.length;i++){
      if(isPrime(getSum[i])){
        count++;
      }
    }
    return count;
  }
  