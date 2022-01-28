function two(increase){
    let max=0;
    for(i=0;i<increase.length;i++){
    let one=0;
    for(let j=0;j<increase[i].length;j++){
    one+=increase[i][j];
    }
    if(one>max){
    max=one;
    }
    }
    return max;
    }
    let arrys=[[6, 645, 797, 201], [214, 564, 854, 201], [265, 564, 564, 2345]]
    let fixit=two(arrys)
    console.log(fixit)