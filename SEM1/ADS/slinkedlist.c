#include<stdio.h>
#include<stdlib.h>
struct node
{
	int info;
	struct node*link;
};
struct node* start=NULL;
void traverse()
{
	struct node* temp;
	if(start==NULL)
	 printf("\n List is empty");
	else
         {
	  temp=start;
	   printf("the list is\n");
	  while(temp!=NULL)
		{
		 printf("%d-->",temp->info);
		 temp=temp->link;
		}
	 }
}
void insertAtFront()
{
 int data;
 struct node* temp;
 temp=malloc(sizeof(struct node));
 printf("\n Enter the number to be inserted : ");
 scanf("%d",&data);
 temp->info=data;
 temp->link=start;
 start=temp;
}
void insertAtEnd()
{
 int data;
 struct node*temp,*head;
 temp=malloc(sizeof(struct node));
 printf("\n Enter the number to be inserted : ");
 scanf("%d",&data);
 temp->link=0;
 temp->info=data;
 head=start;
 while(head->link!=NULL)
 {
  head=head->link;
 }
head->link=temp;
}
void insertAtPosition()
{
 struct node *temp,*newnode;
 int pos,data,i=1;
 newnode=malloc(sizeof(struct node));
 printf("\n Enter the position and the data to be inserted : ");
 scanf("%d %d",&pos,&data);
 temp=start;
 newnode->info=data;
 newnode->link=0;
 while(i<pos-1)
 {
  temp=temp->link;
  i++;
 }
 newnode->link=temp->link;
 temp->link=newnode;
}
void deleteAtFront()
{
 struct node*temp;
 if(start==NULL)
  printf("\n list is empty\n");
 else
 {
  temp=start;
  start=start->link;
  free(temp);
 }
}
void deleteAtEnd()
{
 struct node*temp,*prevnode;
 if(start==NULL)
  printf("\n list is empty\n");
 else
 {
  temp=start;
  while(temp->link!=0)
  {
   prevnode=temp;
   temp=temp->link;
  }
 free(temp);
 prevnode->link=0;
 }
}
void deleteAtPos()
{
 struct node*temp,*position;
 int i=1,pos;
 if(start==NULL)
  printf("\n list is empty\n");
 else
  {
   printf("\n enter the position\n");
   scanf("%d",&pos);
   position=malloc(sizeof(struct node));
   temp=start;
   while(i<pos-1)
   {
    temp=temp->link;
    i++;
   }
  position=temp->link;
  temp->link=position->link;
  free(position);
 }
}
void search()
{
 int found=-1,key;
 struct node *tr=start;
 if(start==NULL)
 {
  printf("\n list is empty\n");
 }
else
 {
  printf("Enter the element to be searched ");
  scanf("%d",&key);
  while(tr!=NULL)
  { 
   if(tr->info==key)
    {
     found=1;
     break;
    }
    else
    {
     tr=tr->link;
    }
  }
 if(found==1)
  {
   printf("Yes,%d is present in the linked list\n",key);
  }
  else
  {
   printf("No,%d is not present in the linked list\n",key);
  }
 }
}
void main()
 {
  int choice;
  while(1)
	{
  printf("\n1.to see the list\n");
  printf("2.insertion at the begining\n");
  printf("3.insertion at the end\n");
  printf("4.insertion at the position\n");
  printf("5.deletion at the begining\n");
  printf("6.deletion at the end\n");
  printf("7.deletion at the position\n");
  printf("8.search\n");
  printf("9.exit\n");
  printf("enter your choice\n");
  scanf("%d",&choice);
  switch (choice)
  {
   case 1:traverse();
	  break;
   case 2:insertAtFront();
	  break;
   case 3:insertAtEnd();
	  break;
   case 4:insertAtPosition();
	  break;
   case 5:deleteAtFront();
	  break;
   case 6:deleteAtEnd();
	  break;
   case 7:deleteAtPos();
	  break;   
   case 8:search();
	  break;
   case 9:exit(1);
          break;
   default:printf("incorrect choice\n");
  }
}
}
