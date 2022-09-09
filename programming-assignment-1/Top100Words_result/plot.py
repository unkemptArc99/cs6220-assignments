import matplotlib as mpl
import matplotlib.pyplot as plt
import numpy as np

fig, ax = plt.subplots()
ax.plot([5.6, 11.1, 15.9, 21.5, 27.0, 31.8], [18.15, 26.1, 36.16, 44.49, 52.24, 60.21])
ax.set_xlabel("Dataset Size (MB)")
ax.set_ylabel("Time taken (seconds)")
ax.set_title("Finding top 100 words in files using Hadoop MapReduce")
fig.savefig("plot.png")