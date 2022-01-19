function newChickenRecipe(stuffArr, choiceNum) {
    // TODO: 여기에 코드를 작성하세요.
    // stuffArr를 오름차순으로 정렬, 상한재료도 제외
    // 상한재료 1001110 -> '1001110' -> 0의 개수 카운팅
    
    //0이 마지막에 연달아 3개있을 경우 -> edge case 발생 가능
    //let filtered = stuffArr.filter((el) => String(el).slice(-3) !== '000')
    
    //0이 3개있는지 확인 후 filter
    let filtered = stuffArr.filter((el) => {
      let count = 0;
      let str = el.toString();
      for(let i=0;i<str.length;i++){
        if(str[i] === '0'){
          count++;
        }
      }

      if(count < 3){
        return el;
      }
    });
    //오름차순 정렬
    let sortedArr = filtered.sort((a,b) => a-b);
    //빈배열일 때
    //choiceNum보다 배열수가 더 적을때, 사용할 수 있는 재료가 없을때
    if(sortedArr.length === 0 || sortedArr.length < choiceNum){
      return [];
    }
  
    //순열 구하기
    const getPermutations = function (arr, selectNumber) {
      const results = [];
      if (selectNumber === 1) return arr.map((el) => [el]); 
      // n개중에서 1개 선택할 때(nP1), 바로 모든 배열의 원소 return. 1개선택이므로 순서가 의미없음.
  
      arr.forEach((fixed, index, origin) => {//origin[index]
        const rest = [...origin.slice(0, index), ...origin.slice(index+1)] 
        // 해당하는 fixed를 제외한 나머지 배열 
        const permutations = getPermutations(rest, selectNumber - 1); 
        // 나머지에 대해서 순열을 구한다.
        const attached = permutations.map((el) => [fixed, ...el]); 
        //  돌아온 순열에 떼 놓은(fixed) 값 붙이기
        results.push(...attached); 
        // 배열 spread syntax 로 모두다 push
      });
  
      return results; // 결과 담긴 results return
    }
  
    return getPermutations(filtered,choiceNum);
  
  }
  
  