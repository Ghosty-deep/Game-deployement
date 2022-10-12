#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node*next;
};
void linkedlisttraversal(struct node*ptr)
{
    while(ptr!=NULL)
    {
        printf("element is %d",ptr->data);
        ptr=ptr->next;
    }
}
struct node* deleteatfirst(struct node*head)
{
struct node*ptr=head;
head=head->next;
free(ptr);
return head;
}


struct node* deleteatindex (struct node*head,int index)
struct node*p=head;
struct node*q=head->next;
for(i=0;i<index-1;i++)
{
p=p->next;
q=q->next;
}
p->next=q->next;
free(q)
return head;
}

struct node* deleteatend(struct node*head)
{
struct node*p=head;
struct node*q=head->next;
 while(q->next!=NULL)
{
    p=p->next;
    q=q->next;
}
p->next=q->next;
free(q);
return head;
}

struct node* deleteatvalue(struct node*head,int value)
{
    struct node*p=head;
    struct node*q=head->next;
    

}
