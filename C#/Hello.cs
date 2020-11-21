using System;

namespace HelloWorld
{
    class Program
    {
        static void Main(string[] args)
        {
            for(int i=0;i<100;i++)
            {
                string text = String.Format("C#: Hello, World! No.{0}",i);
                System.Console.WriteLine(text);
            }
        }
    }
} 

// dotnet new console
// dotnet build && dotnet bin/Debug/net5.0/hello.dll
// 