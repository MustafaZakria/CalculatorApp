package com.ntgclarity.calculator

class Calculator {
    var operand = 0.0
    var result = 0.0
    var firstTime:Boolean = true

    fun execute(operation: String): Double {
        if (operation == "+") {
            operand = result + operand
        }
        else if (operation == "-") {
            operand = result - operand
            if(firstTime)
                operand = Math.abs(operand)
        }
        else if (operation == "*") {
            if(firstTime)
                result = 1.0
            operand = result * operand
        }
        else if (operation == "/") {
            if(!firstTime)
                operand = result / operand
        }
        else if (operation == "sqrt") {
            operand = Math.sqrt(operand)

        }

        result = operand
        firstTime = false
        return operand
    }
}