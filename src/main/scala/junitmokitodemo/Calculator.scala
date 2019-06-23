package junitmokitodemo


object Calculator {

  val calculatorService = CalculatorService

  def add(i : Int,j : Int) : Unit ={
    return calculatorService.add(i,j)
  }


}
