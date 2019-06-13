#include <stdio.h>
int main() {
	//Type your code
  int num;
  scanf("%d",&num);
  divisor(num);
	return 0;
}
void divisor(int n)
{
  for(int i=1; i<=n; i++)
  {
      if(n%i == 0)
        printf("%d \n",i);
  }
}