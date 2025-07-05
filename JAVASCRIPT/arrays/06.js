const nums = [1, 2, 3, 4, 5, 6]

function filtraPares(arr){
    const result= nums.filter((nums) => nums % 2 === 0)
    console.log(result)
}
 filtraPares(nums)