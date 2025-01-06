def list = [1, 2, 3, 4, 5]

// Solution 1: Use collect to create a new list with the transformed values
def doubledList = list.collect { it * 2 }
println doubledList // Output: [2, 4, 6, 8, 10]

// Solution 2:  Modify the list in place using eachWithIndex
list.eachWithIndex { element, index ->
    list[index] = element * 2
}
println list // Output: [2, 4, 6, 8, 10]

// Solution 3: Use a loop for more control (less Groovy-ish)
for (int i = 0; i < list.size(); i++) {
    list[i] *= 2
}
println list // Output: [2, 4, 6, 8, 10]