ls src -directory | sort name |% {
	cp .dockerignore $_
	docker build $_ -t "denisbalan/$(split-path $_ -Leaf)" -f Dockerfile
}