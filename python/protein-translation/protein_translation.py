from textwrap import wrap


def proteins(strand):

  aminos = {
      ("AUG"): "Methionine",
      ("UUU", "UUC"): "Phenylalanine",
      ("UUA", "UUG"): "Leucine",
      ("UCU", "UCC", "UCA", "UCG"): "Serine",
      ("UAU", "UAC"): "Tyrosine",
      ("UGU", "UGC"): "Cysteine",
      ("UGG"): "Tryptophan",
      ("UAA", "UAG", "UGA"): "STOP"
      }

  codons = wrap(strand, 3)
  proteins = []
  for codon in codons:
    for k in aminos.keys():
      if codon in k:
        if aminos[k] is not "STOP":
          proteins.append(aminos[k])
          break
        elif aminos[k] is "STOP":
          return proteins
        else:
          raise Exception("Something bad happened while checking codon to amino mapping")

  return proteins

