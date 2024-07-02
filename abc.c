#include<stdio.h>
#include<conio.h>
void main()
{
int arr1[100],arr2[100],i,j,m,n;
printf("Enter m");
scanf("%d",&m);
printf("enter n");
scanf("%d",&n);
printf("Enter the array arr1");
for(i=0;i<m-1;i++)
{

    scanf("%d",&arr1[i]);

}
printf("Enter the array arr2");
for(j=0;j<n-1;j++)
{
    printf("Enter the %d",&j );
    scanf("%d",&arr2[j]);

}
for (i=0;i<m-1;i++)
{
    for(j=0;j<n-1;j++)
    {
        if(arr1[i]==arr2[j])
        {
            printf("The arr2 is a subset of arr1");
        }

    }
}


}
