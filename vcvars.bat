@echo off
for /F "tokens=* USEBACKQ" %%F in (`"%programfiles(x86)%\Microsoft Visual Studio\Installer\vswhere.exe" -version 16.0 -property installationPath`) do set VCINSTALLPATH=%%F
call "%VCINSTALLPATH%\Common7\Tools\VsDevCmd.bat"
call "%VCINSTALLPATH%\VC\Auxiliary\Build\vcvars64.bat"
REM mkdir build
REM cd build
REM cmake -G"Visual Studio 16 2019" -A x64 -T v142 <CHANGE WHATEVER IN THIS LINE AND PUT WHATEVER ELSE HERE NEEDS TO BE PASSED TO CMAKE>