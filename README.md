# Groovy's `each` Method Returns Null

This repository demonstrates a common gotcha in Groovy: the `each` method on collections does not return a modified collection.  It iterates through each element and applies the closure, but returns `null`.

This can lead to unexpected null pointer exceptions or incorrect results if you assume `each` will modify the collection in place or return a new one. 

The `bug.groovy` file shows the problem. The `bugSolution.groovy` file presents solutions.