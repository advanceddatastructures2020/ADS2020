#include<stdio.h>
#include<conio.h>
void main()
{
int i,j;
int a[2][2],b[2][2],result[2][2];
clrscr();
printf("enter 1st matrix\n");
for(i=0;i<2;++i)
for(j=0;j<2;++j)
{
printf("enter a\t%d%d:",i+1,j+1);
scanf("%d",&a[i][j]);
}
printf("enter 2nd matrix\n");
for(i=0;i<2;++i)
for(j=0;j<2;++j)
{
printf("enter b\t%d%d:",i+1,j+1);
scanf("%d",&b[i][j]);
}
for(i=0;i<2;++i)
for(j=0;j<2;++j)
{
result[i][j]=a[i][j]+b[i][j];
}
printf("\nsum is\n");
for(i=0;i<2;++i)
for(j=0;j<2;++j)
{
printf("%d\t",result[i][j]);
if(j==1)
printf("\n");
}
getch();

}