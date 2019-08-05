a, b, c, d = map(float, input().split())
avg = (a*2 + b*3 + c*4 + d)/10
print("Media: {:.1f}".format(avg))
if avg >= 7:
    print("Aluno aprovado.")
elif avg < 5:
    print("Aluno reprovado.")
else:
    print("Aluno em exame.")
    e = float(input())
    print("Nota do exame: {:.1f}".format(e))
    avg = (avg+e)/2
    if avg >=5:
        print("Aluno aprovado.")
    else:
        print("Aluno reprovado.")
    print("Media final: {:.1f}".format(avg))
