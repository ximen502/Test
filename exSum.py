def calc_sum():
    summ = 0
    for n in range(1, 101):
        summ += n
    return summ

def calc_sum2():
    summ = 0
    n = 1
    while n <= 100:
        summ += n
        n += 1
    return summ

summ = calc_sum2()


print(summ)
