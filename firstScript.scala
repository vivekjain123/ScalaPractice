def isPrime2(num: Int): Boolean={
  for(n <- Range(2,num)){
    if(num%n==0)
    return false
  }
  return true
}
