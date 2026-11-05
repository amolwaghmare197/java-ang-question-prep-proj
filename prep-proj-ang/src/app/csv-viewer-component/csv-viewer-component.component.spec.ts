import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CsvViewerComponentComponent } from './csv-viewer-component.component';

describe('CsvViewerComponentComponent', () => {
  let component: CsvViewerComponentComponent;
  let fixture: ComponentFixture<CsvViewerComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CsvViewerComponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CsvViewerComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
