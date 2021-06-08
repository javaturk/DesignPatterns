export class ROM {
  private size: number;

  constructor(size: number) {
    this.size = size; // Size of ROM in MB
  }

  getOSKernelImage(): number[] {
    console.log("ROM: Loading the image of OS kernel.");
    const kernelImage = Array(2 * 1024 * 1024);

    // ...

    return kernelImage;
  }
}