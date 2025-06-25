export class ProductV2 {

    constructor(
        public id: number = 0,
        public title: string = '',
        public price: number = 100,
        public description: string = '',
        public availabilityStatus: string ='',
        public stock:number=0,
    ) {

    }
}
