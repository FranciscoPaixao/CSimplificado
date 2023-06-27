
define i32 @main() {
    %x = alloca i32
    %y = alloca i32
    %1 = mul i32 2, 6
    store i32 %1, i32* %x
    %2 = mul i32 2, 3
    store i32 %2, i32* %y
    %y_l = load i32, i32* %y
    %x_l = load i32, i32* %x
    %3 = icmp sgt i32 %y_l, %x_l
    br i1 %3, label %if_true3, label %if_else3
    if_true3:
    %4 = load i32, i32* %y
    call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @formatStringInt, i32 0, i32 0), i32 %4)
    br label %if_end3
    if_else3:
    %6 = load i32, i32* %x
    call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @formatStringInt, i32 0, i32 0), i32 %6)
    br label %if_end3
    if_end3:
    ret i32 0
}
declare i32 @printf(i8*, ...)
@formatStringInt = constant [4 x i8] c"%d\0A\00" 
@formatStringDouble = constant [4 x i8] c"%f\0A\00"