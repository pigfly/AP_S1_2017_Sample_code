### Use exceptions to:

1. Use try-with-resources whenever possible
2. Handle problems at appropriate level (Avoid catching exceptions unless you know what to do with them)
3. Fix the problem and re-call the method that causes exception
4. Calculate some alternative result instead ofw hat the method was supposed to produce
5. Do whatever you can in the current context and rethrow the same exception to a higher context
6. Terminate your program