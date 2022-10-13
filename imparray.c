#include<stdio.h>
#include<stdlib.h>
struct array
{
    int total_size;
    int used_size;
    int*ptr;
    struct array*a;
};
void creatarray (struct array*a, int tsize,int usize)
{
    a->total_size=tsize;
    a->used_size=usize;
    a->ptr=(int*) malloc(sizeof(int));

}
void show(struct array*a)
{
    for (int i=0;i<a->used_size;i++)
    {
        printf("%d\n",a->ptr);
    }
}
void setval(struct array*a)
{
    int n;
    for(int i=0;i<a->used_size;i++)
    {
        printf("enter element %d",i);
        scanf("%d",i);
        (a->ptr) [i]=n;
    }
}
int main()
{
    struct array marks;
    createarray(&marks, 10,2);
    printf("we are running set val now\n");
    setval(marks);
    printf("we are running show now\n")
    (marks);
    return 0;
}