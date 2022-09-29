/*
Print a sequence of numbers starting with N, without using loop, in which A[i+1] = A[i] - 5, if A[i]>0, else A[i+1] = A[i] + 5 repeat it until A[i]=N.

Note:- Once you change a operation you need to continue doing it.
*/
static void printPattern(int n,int curr, boolean flag)
{
//Enter your code here
    System.out.print(curr + " ");
    if(curr == n && !flag){
        return;
    }
    if(curr <= 0){
        flag = false;
    }
    if(flag){
        printPattern(n, curr - 5, flag);
    }else{
        printPattern(n, curr + 5, flag);
    }
}