#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        // insert code here...
        for(int i=0;i<100;i++){
            NSLog(@"Hello, World! No.%d",i);
        }
    }
    return 0;
}

// gcc -framework Foundation -x objective-c hello.m && ./a.out
