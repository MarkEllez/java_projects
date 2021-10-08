package project_13.GenStack12;

  interface IGenStack<T> {
     void push(T obj) throws StackFullException;

     T pop() throws StackEmptyException;
}
