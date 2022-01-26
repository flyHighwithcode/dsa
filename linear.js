function siva(one, two){
for(let i=0; i<one.length; i++){
if(one[i]===two){
return i;
}
}
return -1;
}
let two = [65, 655, 2535, 24560]
let ones = siva(two, 152);
console.log(ones)