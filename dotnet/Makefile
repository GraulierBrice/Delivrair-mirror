SRC=src
BIN=bin
EXE=server.exe

run:
	$(BIN)/$(EXE)

compile:
	mcs $(SRC)/*.cs -pkg:wcf -out:$(BIN)/$(EXE);

compile-run:
	make compile; make run;

clean:
	rm $(BIN)/$(EXE)