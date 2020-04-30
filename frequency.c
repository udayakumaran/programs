#include<stdio.h>
#include<conio.h>
int main()
{
int a[]={0,0,0,1,3,3,2,1,3,5,6,0};
int b=a.length;
for(int i=0;i<b;i++) {
    for(int j=0;j<i;j++) {
        int temp;
        if( a[j]>a[i]) {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
}

for(int r=0;r<a.length;r++) {
    System.out.println(a[r]);
}
}
