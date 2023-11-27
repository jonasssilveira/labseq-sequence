import {Component} from '@angular/core';
import {LabseqService} from '../../service/labseq.service';

@Component({
  selector: 'app-labseq',
  templateUrl: './labseq.component.html',
  styleUrls: ['./labseq.component.css']
})
export class LabseqComponent {
  public result: number | undefined;
  public n: number;
  public failed: boolean;

  constructor(private labseqService: LabseqService) {
    this.failed = false;
    this.n = 0;
  }

  onSubmit() {
    this.labseqService.calcule(this.n).subscribe(
      {
        next: (value: number) => {
          this.failed = false;
          this.result = value;
        },
        error: () => {
          this.failed = true;
          this.result = undefined;
        }
      }
    );
  }
}
