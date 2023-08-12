#include<stdio.h>

void main()
{
    float i;
    printf("Enter a number: ");
    scanf("%f", &i);

    if(i == (int)i)
        printf("It is an integer number");
    else if((int)(i*10)%10 <=-5 )
        printf("It is a float whose integer approximation = %d", (int)i-1);

    else if((int)(i*10)%10 >=5 )
        printf("It is a float whose integer approximation = %d", (int)i+1);

    else
        printf("It is a float whose integer approximation = %d", (int)i);
}
