function two(min){
let minimum=min[0];
for(let i=1;i<min.length;i++){
if(min[i]<minimum){
minimum=min[i]
}
}
return minimum
}
let bunch=[650, 250, 24116, 02145]
let int=two(bunch);
console.log(int)