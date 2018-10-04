def power_of(x):
	def power_ofX(y):
		return y**x
	return power_ofX # <- function object

p5 = power_of(5)
p1 = power_of(1)

print(p5(2))
print(p1(2))

# possible in Java 8 with new function object