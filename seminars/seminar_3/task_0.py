def reWriter(inp, out):
    with (
        open(inp, mode = "r", encoding="UTF-8") as input_file,
        open(out, mode = "w", encoding="UTF-8") as output_file
    ):
        output_file.write(input_file.read())

reWriter("l3.txt", "s3_t0.txt")