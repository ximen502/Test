for row in range(1, 10):
    for col in range(1, row + 1):
        # 下面的print语句中的end是为了避免print语句默认的换行行为
        print(f"{col} x {row} = {row * col}", end=' ')
    print("\n")
