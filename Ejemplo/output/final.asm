include macros2.asm
include number.asm

.MODEL SMALL
.386
.STACK 200h

.DATA
_a1 dd ?
_b1 dd ?
_z dd ?
_a dd ?
_b dd ?
_c dd ?
_d dd ?
_e dd ?
_f dd ?
_HolaMundo db "Hola Mundo$"
_30@punto05 dd 30.05
_2023 dd 2023.0
_1@punto5 dd 1.5
_3 dd 3.0
_1 dd 1.0
_2 dd 2.0
_4 dd 4.0
_5 dd 5.0
_6 dd 6.0
_10 dd 10.0
_7 dd 7.0
_9 dd 9.0
_20 dd 20.0
_contador dd, ?
_resultado dd, ?
_0 dd, 0.0
_@SUMA1 dd, ?
_@RESTA1 dd, ?
_@SUMA2 dd, ?
_@RESTA2 dd, ?
_@SUMA3 dd, ?
_@RESTA3 dd, ?
_@SUMA4 dd, ?
_@RESTA4 dd, ?
_@SUMA5 dd, ?
_@RESTA5 dd, ?
_@SUMA6 dd, ?
_@SUMA9 dd, ?
_@RESTA6 dd, ?
_@SUMA7 dd, ?
_@MUL1 dd, ?
_@DIV1 dd, ?
_@SUMA8 dd, ?
.CODE
start:
	MOV EAX,@DATA
	MOV DS,EAX
	MOV ES,EAX

	displayString _HolaMundo
	newLine 1

	displayFloat _30@punto05,2
	newLine 1

	displayFloat _2023,2
	newLine 1

	fld _1@punto5
	fstp _b1

	DisplayFloat _b1,2
	newLine 1

	fld _3
	fstp _a1

	fld _0
	fstp _resultado
	fld _a1
	fstp _contador
	if_1:
		fld _0
		fld _contador
		fcomp
		fstsw ax
		sahf
		je end_if_1
	then_part_1:
		fld _resultado
		fld _1
		fadd
		fstp _@SUMA1

		fld _@SUMA1
		fstp _resultado
		fld _contador
		fld _1
		fsub
		fstp _@RESTA1

		fld _@RESTA1
		fstp _contador
		jmp end_if_1
	end_if_1:
	if_2:
		fld _0
		fld _contador
		fcomp
		fstsw ax
		sahf
		je end_if_2
	then_part_2:
		fld _resultado
		fld _2
		fadd
		fstp _@SUMA2

		fld _@SUMA2
		fstp _resultado
		fld _contador
		fld _1
		fsub
		fstp _@RESTA2

		fld _@RESTA2
		fstp _contador
		jmp end_if_2
	end_if_2:
	if_3:
		fld _0
		fld _contador
		fcomp
		fstsw ax
		sahf
		je end_if_3
	then_part_3:
		fld _resultado
		fld _3
		fadd
		fstp _@SUMA3

		fld _@SUMA3
		fstp _resultado
		fld _contador
		fld _1
		fsub
		fstp _@RESTA3

		fld _@RESTA3
		fstp _contador
		jmp end_if_3
	end_if_3:
	if_4:
		fld _0
		fld _contador
		fcomp
		fstsw ax
		sahf
		je end_if_4
	then_part_4:
		fld _resultado
		fld _4
		fadd
		fstp _@SUMA4

		fld _@SUMA4
		fstp _resultado
		fld _contador
		fld _1
		fsub
		fstp _@RESTA4

		fld _@RESTA4
		fstp _contador
		jmp end_if_4
	end_if_4:
	if_5:
		fld _0
		fld _contador
		fcomp
		fstsw ax
		sahf
		je end_if_5
	then_part_5:
		fld _resultado
		fld _5
		fadd
		fstp _@SUMA5

		fld _@SUMA5
		fstp _resultado
		fld _contador
		fld _1
		fsub
		fstp _@RESTA5

		fld _@RESTA5
		fstp _contador
		jmp end_if_5
	end_if_5:
	fld _resultado
	fstp _a1

	DisplayFloat _a1,2
	newLine 1

while_1:
		fld _6
		fld _a1
		fcomp
		fstsw ax
		sahf
		jb end_while_1
		fld _10
		fld _a1
		fcomp
		fstsw ax
		sahf
		ja end_while_1
cuerpo_while_1:
		if_6:
			fld _7
			fld _a1
			fcomp
			fstsw ax
			sahf
			je then_part_6
			fld _9
			fld _a1
			fcomp
			fstsw ax
			sahf
			jne end_if_6
		then_part_6:
			DisplayFloat _a1,2
			newLine 1
			jmp end_if_6
		end_if_6:
		fld _a1
		fld _1
		fadd
		fstp _@SUMA6

		fld _@SUMA6
		fstp _a1
jmp while_1
end_while_1:

	fld _1
	fstp _a

	fld _2
	fstp _b

	fld _3
	fstp _c

	fld _4
	fstp _d

	fld _5
	fstp _e

	fld _6
	fstp _f

	fld _b
	fld _c
	fmul
	fstp _@MUL1

	fld _a
	fld _@MUL1
	fadd
	fstp _@SUMA7

	fld _e
	fld _f
	fadd
	fstp _@SUMA8

	fld _d
	fld _@SUMA8
	fdiv
	fstp _@DIV1

	fld _@SUMA7
	fld _@DIV1
	fsub
	fstp _@RESTA6

	fld _@RESTA6
	fld _20
	fadd
	fstp _@SUMA9

	fld _@SUMA9
	fstp _z

	DisplayFloat _z,2
	newLine 1

	MOV AX,4C00h
	INT 21h
END start;
