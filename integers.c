#include<stdio.h>

int array[3] = {3, 1, 9};

struct Node{
	int data;
	struct Node *next, *prev;
};

struct Node *head[3];

int read(int i)
{
	return head[i]->data;
}

void write(int i, int val)
{
	array[i] = val;
}

int main()
{
	read(1);
	write(1, 25);
	return 0;
}

