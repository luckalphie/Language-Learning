package main

import (
	"fmt"
)

func main() {
	for i := 0; i < 100; i++ {
		fmt.Printf("GO: Hello, World! No.%d\n", i)
	}
}

// go get -v github.com/sqs/goreturns
// go get -v github.com/uudashr/gopkgs/v2/cmd/gopkgs
// go get -v github.com/mdempsky/gocode
// go get -v github.com/ramya-rao-a/go-outline
// go get -v github.com/rogpeppe/godef
// go get -v golang.org/x/tools/gopls

// go run hello.go
// go build hello.go
