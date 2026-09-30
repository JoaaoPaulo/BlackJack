@echo off
cd /d "%~dp0"
javac -d out -sourcepath src src\blackjack\Main.java || (pause & exit /b)
chcp 65001 > nul
java -Dstdout.encoding=UTF-8 -cp out blackjack.Main
pause
