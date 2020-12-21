@echo off
set USERDIR=%cd%
set BUILDDIR="%~dp0cmake-build-release_x64"

rem create build directory
mkdir %BUILDDIR%
cd %BUILDDIR%

rem native library
cmake -G"NMake Makefiles" ..
nmake

cd %USERDIR%
