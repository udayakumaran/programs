#include <iostream>
using namespace std;

const int MAX = 100;

// Fills a[m][n] with values from 1 to m*n in
// spiral fashion.
void spiralFill(int m, int n, int a[][MAX])
{
	// Initialize value to be filled in matrix
	int val = 1;

	int k = 0, l = 0;
	while (k < m && l < n)
	{

		for (int i = l; i < n; ++i)
			a[k][i] = val++;


		k++;


		for (int i = k; i < m; ++i)
			a[i][n-1] = val++;
		n--;

		if (k < m)
		{
			for (int i = n-1; i >= l; --i)
				a[m-1][i] = val++;
			m--;
		}


		if (l < n)
		{
			for (int i = m-1; i >= k; --i)
				a[i][l] = val++;
			l++;
		}
	}
}
int main()
{
	int m = 4, n = 4;
	int a[MAX][MAX];
	spiralFill(m, n, a);
	for (int i=0; i<m; i++)
	{
	for (int j=0; j<n; j++)
		cout << a[i][j] << " ";
		//cout << a[1][3];
	cout << endl;
	}
	return 0;
}
