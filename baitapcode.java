import java.util.Scanner;
import java.util.*;
public class baitapcode
{
	public static void menu()
	{
		System.out.println("---------- MENU ----------");
		System.out.println("1. Viet chuong trinh giai phuong trinh bac nhat trong do a,b nhap tu ban phim");
		System.out.println("2. Viet chuong trinh giai phuong trinh bac hai trong do a,b,c nhap tu ban phim");
		System.out.println("3. Viet chuong trinh nhap vao so dien su dung cua thang va tinh tien dien");
		System.out.println("4. Kiem tra so chinh phuong");
		System.out.println("5. Xep loai hoc tap");
		
	}

	public static void PTbacnhat(double a, double b)
	{
		double x;
		if (a == 0)
		{
			if (b == 0)
			{
				System.out.println("Phuong trinh vo so nghiem");
			}
			else
			{
				System.out.println("Phuong trinh vo nghiem");
			}
		}
		else
		{
			x = -b/a;
			System.out.println("Nghiem cua phuong trinh bac nhat la: " + x);
		}
	}

	public static void PTbachai(double a, double b, double c)
	{
		double x, delta, x1, x2;
		if (a == 0)
		{
			x = -c/b;
			System.out.println("Phuong trinh nay la phuong trinh bac nhat va co nghiem la: " + x);
		}
		else if (a != 0)
		{
			delta = b*b - 4*a*c;
			if (delta < 0)
			{
				System.out.println("Phuong trinh bac 2 vo nghiem");
			}
			else if (delta == 0)
			{
				x = -b/(2*a);
				System.out.println("Phuong trinh bac 2 co nghiem kep la: " + x);
			}
			else if (delta > 0)
			{
				x1 = (-b+(Math.sqrt(delta))/(2*a));
				x2 = (-b-(Math.sqrt(delta))/(2*a));
				System.out.println("Phuong trinh bac 2 co hai nghiem phan biet x1,x2 la: " + x1 + " va " + x2);
			}
		}
	}

	public static void TienDien(int SoDien)
	{
		int tien;
		if (SoDien < 50)
		{
			tien = SoDien*1000;
			System.out.println("So tien can tra la: " + tien);
		}
		else
		{
			tien = 50*1000+(SoDien-50)*1200;
			System.out.println("So tien can tra la: " + tien);
		}
	}

	public static void SoCP(int n)
	{		
		double i = Math.sqrt(n);
		if (i*i == n)
		{
			System.out.println(n + " la so chinh phuong");
		}
		else
		{
			System.out.println(n + " khong phai la so chinh phuong");
		}
	}

	public static void Xeploai(double Dtb)
	{
		if (Dtb < 5.0)
		{
			System.out.println("Xep loai kem");
		}
		else if (Dtb < 7.0)
		{
			System.out.println("Xep loai trung binh");
		}
		else if (Dtb < 8.0)
		{
			System.out.println("Xep loai kha");
		}
		else
		{
			System.out.println("Xep loai gioi");
		}
	}

	public static void main(String[] args)
	{
		int chon;
		Scanner data = new Scanner(System.in);
		menu();
		do
		{
			System.out.print("\nSu lua chon cua ban la: "); chon = data.nextInt();
			switch (chon)
			{
				case 1:
				{
					System.out.print("Nhap a = "); double a = data.nextDouble();
					System.out.print("Nhap b = "); double b = data.nextDouble();
					PTbacnhat(a,b);
				} break;
				case 2:
				{
					System.out.print("Nhap a = "); double a = data.nextDouble();
					System.out.print("Nhap b = "); double b = data.nextDouble();
					System.out.print("Nhap c = "); double c = data.nextDouble();
					PTbachai(a,b,c);
				} break;
				case 3:
				{
					System.out.print("Nhap so dien su dung = "); int SoDien = data.nextInt();
					TienDien(SoDien);
				} break;
				case 4:
				{
					System.out.print("Nhap so nguyen n = "); int n = data.nextInt();
					SoCP(n);
				} break;
				case 5:
				{
					System.out.print("Nhap so Diem Trung Binh = "); double Dtb = data.nextDouble();
					Xeploai(Dtb);
				} break;
			}		
		} while (chon != 0);
	}
}