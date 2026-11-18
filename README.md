# Q&A
## What problem did I run into?
When `Cash` extends `Asset`, two things get in the way:

- The compiler forces me to implement `getValue()`. `Asset` is abstract and `getValue()` is an abstract method, 
so `Cash` won’t compile until it overrides it. The error is: “Cash is not abstract and does not override abstract 
method getValue() in Asset”.


- The `Asset` constructor doesn’t fit cash. `Asset` has no empty constructor, so `Cash` has to call `super(description, 
dateAcquired, originalCost)`. But cash doesn’t really have a “date acquired” or an “original cost” the way a 
house or a car does.

## What were my options?

- Pass a placeholder for `originalCost` and store the amount in its own field. `Cash` gets a cash field for the 
real amount, and `getValue()` returns that field.
  
- Reuse `originalCost` as the amount. No extra field; `getValue()` returns `getOriginalCost()`.
  
- Add a second constructor to `Asset` that only takes some of the fields and fills in defaults for the rest.
This means changing the base class just to fit one subclass.