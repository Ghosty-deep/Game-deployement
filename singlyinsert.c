#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node*next;
};
void linkedlisttraversal(struct node*ptr)
{
    while(ptr!=NULL)
    {
        printf("element is %d\n",ptr->data);
        ptr= ptr->next;
    }
}
struct node* insertbegining(struct node*head,int data)
{
struct node* ptr = (struct node*) malloc(sizeof (struct node));
struct node*p = head;
ptr -> next = head;
ptr -> data= data;
head = ptr;
return head;
}

struct node* insertbetween(struct node*head,int index, int data)
{
struct node* ptr = (struct node*) malloc(sizeof (struct node));
struct node*p = head;
{
    while (ptr->)
}

p -> next = ptr ;
ptr -> data= data;
head = ptr;
return head;
}

int main()
{
    struct node*head=(struct node*) malloc(sizeof(struct node));
    struct node*second=(struct node*) malloc(sizeof(struct node));
    struct node*third=(struct node*) malloc(sizeof(struct node));
    struct node*fourth=(struct node*) malloc(sizeof(struct node));

    head->data=3;
    head->next=second;
    second->data=5;
    second->next=third;
    third->data=9;
    third->next=fourth;
    fourth->data=6;
    fourth->next=NULL;
    printf("linked list before insertion\n");
    linkedlisttraversal(head);

    head= insertbegining(head,58);
     printf("linked list after insertion\n");
    linkedlisttraversal(head);
    return 0;
}

