class home
{
	public static void main(String [ ] args)
	{
		sort a = new sort();
		int mass[] = {2,3,5,8,3,2,3,4,1,7,9,4,2};
		a.selectionSort(mass);
		System.out.print("Сортировка выбором: ");
		for (int i = 0 ; i<mass.length;i++)
		{
			System.out.print(mass[i]+ " ");
		}
	}
}