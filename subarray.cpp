// C++ program to print largest contiguous array sum
#include<iostream>
#include<climits>
using namespace std;

int maxSubArraySum(int a[], int size)
{
	int max_so_far = INT_MIN, max_ending_here = 0;

	for (int i = 0; i < size; i++)
	{
		max_ending_here = max_ending_here + a[i];
		if (max_so_far < max_ending_here)
			max_so_far = max_ending_here;

		if (max_ending_here < 0)
			max_ending_here = 0;
	}
	return max_so_far;
}

/*Driver program to test maxSubArraySum*/
int main()
{
	int a[] = {1,2,3,4,5};
	int n = sizeof(a)/sizeof(a[0]);
	int max_sum = maxSubArraySum(a+1, n-1);
	cout << "Maximum contiguous sum is " << max_sum;
	return 0;
}
