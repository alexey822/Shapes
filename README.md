## The following guide was made using Ubuntu 18.04 (32 bit)

#### 0. Install Ubuntu 18.04 (32-bit)

[Lubuntu 18.04.5 LTS (Bionic Beaver)](https://cdimage.ubuntu.com/lubuntu/releases/18.04/release/)

#### 1. Download the toolchain: 
```
toolchain-mips_r2_gcc-4.6-linaro_uClibc-0.9.33.2 1.xz

```

#### 2. Extract the toolchain:
```
~$ sudo tar -xf 'toolchain-mips_r2_gcc-4.6-linaro_uClibc-0.9.33.2 1.xz' -C /opt

```

#### 3. Create/modify environment variables:
```
export PATH="$PATH:/opt/toolchain-mips_r2_gcc-4.6-linaro_uClibc-0.9.33.2/bin"
export CROSS_COMPILE="mips-openwrt-linux-"
export STAGING_DIR="/opt/toolchain-mips_r2_gcc-4.6-linaro_uClibc-0.9.33.2"
```
	
#### 4. Verify that `mips-openwrt-linux-gcc` installed correctly:
```
~$ mips-openwrt-linux-gcc --version

```
> mips-openwrt-linux-gcc (Linaro GCC 4.6-2012.02) 4.6.3 20120201 (prerelease)
> 
> Copyright (C) 2011 Free Software Foundation, Inc.
> 
> This is free software; see the source for copying conditions.  There is NO
>
> warranty; not even for MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

#### 5. Execute `make` command from the directory with source code:
```
~/projects/tyretag$ make

```
> mips-openwrt-linux-g++ -o tyretag ./obj/serial2ethernet.o ./obj/caenrfid.o ./obj/uart.o ./obj/utils.o -lpthread -lrt
> 
> mips-openwrt-linux-strip tyretag

#### 6. (Optional)
You may need to delete and regenerate *.o files from the directory **~/projects/tyretag/obj/**
In this case output of `make` command:

```
~/projects/tyretag$ make

```
> mips-openwrt-linux-gcc -g -c -O0 -Wall -o ./obj/serial2ethernet.o serial2ethernet.c
> 
> mips-openwrt-linux-gcc -g -c -O0 -Wall -o ./obj/caenrfid.o caenrfid.c
> 
> mips-openwrt-linux-gcc -g -c -O0 -Wall -o ./obj/uart.o uart.c
> 
> mips-openwrt-linux-gcc -g -c -O0 -Wall -o ./obj/utils.o utils.c
> 
> mips-openwrt-linux-gcc -M -g -c -O0 -Wall serial2ethernet.c > serial2ethernet.d.$$; sed 's,\(serial2ethernet\)\.o[ :*],\1.o serial2ethernet.d : ,g' < serial2ethernet.d.$$ > ./obj/serial2ethernet.d; rm -f serial2ethernet.d.$$
> 
> mips-openwrt-linux-gcc -M -g -c -O0 -Wall caenrfid.c > caenrfid.d.$$; sed 's,\(caenrfid\)\.o[ :*],\1.o caenrfid.d : ,g' < caenrfid.d.$$ > ./obj/caenrfid.d; rm -f caenrfid.d.$$
> 
> mips-openwrt-linux-gcc -M -g -c -O0 -Wall uart.c > uart.d.$$; sed 's,\(uart\)\.o[ :*],\1.o uart.d : ,g' < uart.d.$$ > ./obj/uart.d; rm -f uart.d.$$
> 
> mips-openwrt-linux-gcc -M -g -c -O0 -Wall utils.c > utils.d.$$; sed 's,\(utils\)\.o[ :*],\1.o utils.d : ,g' < utils.d.$$ > ./obj/utils.d; rm -f utils.d.$$
> 
> mips-openwrt-linux-g++ -o tyretag ./obj/serial2ethernet.o ./obj/caenrfid.o ./obj/uart.o ./obj/utils.o -lpthread -lrt
> 
> mips-openwrt-linux-strip tyretag
	

