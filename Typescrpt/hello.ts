

class Hello {
    greeting: string;
    constructor(message: string) {
        this.greeting = message;
    }
    greet() {
        for (let i = 0; i < 101; i++) {
            console.log(`TypeScript: Hello ${this.greeting}! No.${i}`);
        }
    }
}

let greeter = new Hello("World");

greeter.greet();


// 方法一
// npm install -g typescript
// tsc hello.ts && node hello.js

// 方法二
// npm install -g ts-node
// ts-node hello.ts

// 方法三
// npx ts-node hello.ts