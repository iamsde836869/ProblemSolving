package com.problems.problemSolving.roughdraftprograms;
/*

Stuck in JAVA TLE ?
Here’s the Solution…
There are four methods to take user-input in JAVA.
1. Scanner Class
2. BufferedReader
3. User-defined Fast Reader (Recommended)
4. Reader Class (Fastest)
To see the time and space taken by each of these methods we solve “Enormous Input Test�? problem on SPOJ.
Problem statement taken from SPOJ is as follows :
The purpose of this problem is to verify whether the method you are using to read input data is sufficiently fast to handle problems branded with the enormous Input/Output warning. You are expected to be able to process at least 2.5 MB of input data per second at runtime.
Input
The input begins with two positive integers n k (n, k<= 10�?�). The next n lines of input contain one positive integer tᵢ , not greater than 10�?�, each.
Output
Write a single integer to output, denoting how many integers tᵢ are divisible by k.
Example
Input:
7 3
1
51
966369
7
9
999996
11
Output:
4
Scanner Class
We get TLE in most of the cases while taking input from Scanner Class as it uses built-in nextInt(), nextLong(), nextDouble()… methods to read input data.
This method takes 3.37s and 106M.
//Using Scanner class (Method 1)
import java.util.Scanner;
public class Main{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();//reading integer
int k=sc.nextInt();
int count=0;
while(n-- >0)
{
int num=sc.nextInt();
if(num%k==0)
count++;
}
System.out.println(count);
}
}
BufferedReader
It takes lesser time than Scanner and efficiently reads user input.
This method takes 0.73s and 99M.
//Using BufferedReader (Method 2)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
public class Main
{
public static void main(String args[]) throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st= new StringTokenizer(br.readLine());
int n= Integer.parseInt(st.nextToken());
int k= Integer.parseInt(st.nextToken());
int count=0;
while(n -- >0)
{
int num=Integer.parseInt(br.readLine());
if(num%k==0)
count++;
}
System.out.println(count);
}
}
User-defined FastReader (Recommended)
This is a fast I/O method as it makes use of User-defined class where in a user makes a class of his own and defines every function in that class like nextInt() to take input integer values, nextLine() function to input multiple words, next() function to input Strings, nextFloat() function to read float values, nextDouble() function to read double values. With the help of the object of this user-defined class, we can directly call these functions (ex-obj.functionName) to read the desired type of data.
This method takes 0.69s and 100M.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main
{
static class FastReader
{
BufferedReader br;
StringTokenizer st;
public FastReader()
{
br = new BufferedReader(new
InputStreamReader(System.in));
}
String next()
{
while (st == null || !st.hasMoreElements())
{
try
{
st = new StringTokenizer(br.readLine());
}
catch (IOException e)
{
e.printStackTrace();
}
}
return st.nextToken();
}
int nextInt()
{
return Integer.parseInt(next());
}
long nextLong()
{
return Long.parseLong(next());
}
double nextDouble()
{
return Double.parseDouble(next());
}
String nextLine()
{
String str = “�?;
try
{
str = br.readLine();
}
catch (IOException e)
{
e.printStackTrace();
}
return str;
}
}
public static void main(String[] args)
{
FastReader fs=new FastReader();
int n = fs.nextInt();
int k = fs.nextInt();
int count = 0;
while (n -- > 0)
{
int num = fs.nextInt();
if (num%k == 0)
count++;
}
System.out.println(count);
}
}
Reader Class (Fastest)
This is the fastest method to read user-input. It is very lengthy, so the recommended method is user-defined FastReader.
This method takes 0.25s and 32M.
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main
{
static class Reader
{
final private int BUFFER_SIZE = 1 << 16;
private DataInputStream din;
private byte[] buffer;
private int bufferPointer, bytesRead;
public Reader()
{
din = new DataInputStream(System.in);
buffer = new byte[BUFFER_SIZE];
bufferPointer = bytesRead = 0;
}
public Reader(String file_name) throws IOException
{
din = new DataInputStream(new FileInputStream(file_name));
buffer = new byte[BUFFER_SIZE];
bufferPointer = bytesRead = 0;
}
public String readLine() throws IOException
{
byte[] buf = new byte[64]; // line length
int cnt = 0, c;
while ((c = read()) != -1)
{
if (c == ‘\n’)
break;
buf[cnt++] = (byte) c;
}
return new String(buf, 0, cnt);
}
public int nextInt() throws IOException
{
int ret = 0;
byte c = read();
while (c <= ‘ ‘)
c = read();
boolean neg = (c == ‘-’);
if (neg)
c = read();
do
{
ret = ret * 10 + c — ‘0’;
} while ((c = read()) >= ‘0’ && c <= ‘9’);
if (neg)
return -ret;
return ret;
}
public long nextLong() throws IOException
{
long ret = 0;
byte c = read();
while (c <= ‘ ‘)
c = read();
boolean neg = (c == ‘-’);
if (neg)
c = read();
do {
ret = ret * 10 + c — ‘0’;
}
while ((c = read()) >= ‘0’ && c <= ‘9’);
if (neg)
return -ret;
return ret;
}
public double nextDouble() throws IOException
{
double ret = 0, div = 1;
byte c = read();
while (c <= ‘ ‘)
c = read();
boolean neg = (c == ‘-’);
if (neg)
c = read();
do {
ret = ret * 10 + c — ‘0’;
}
while ((c = read()) >= ‘0’ && c <= ‘9’);
if (c == ‘.’)
{
while ((c = read()) >= ‘0’ && c <= ‘9’)
{
ret += (c — ‘0’) / (div *= 10);
}
}
if (neg)
return -ret;
return ret;
}
private void fillBuffer() throws IOException
{
bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
if (bytesRead == -1)
buffer[0] = -1;
}
private byte read() throws IOException
{
if (bufferPointer == bytesRead)
fillBuffer();
return buffer[bufferPointer++];
}
public void close() throws IOException
{
if (din == null)
return;
din.close();
}
}
public static void main(String[] args) throws IOException
{
Reader rs=new Reader();
int n = rs.nextInt();
int k = rs.nextInt();
int count=0;
while (n -- > 0)
{
int num = rs.nextInt();
if (num%k == 0)
count++;
}
System.out.println(count);
}
}

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class ProblemSolving
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }
        long nextLong()
        {
            return Long.parseLong(next());
        }
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args)
    {
        FastReader fs=new FastReader();
        int n = fs.nextInt();
        int k = fs.nextInt();
        int count = 0;
        while (n -- > 0)
        {
            int num = fs.nextInt();
            if (num%k == 0)
                count++;
            System.out.println(num +"%"+ k);
        }
        System.out.println(count);
    }
}
