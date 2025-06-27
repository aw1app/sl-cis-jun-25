import { configureStore,  createSlice } from "@reduxjs/toolkit";

const counterSlice = createSlice(
    {

        name: 'counter',
        initialState: { val: 0 },

        reducers: {
            //actions
            increment: (state) => { state.val += 1; },
            decrement: (state) => { state.val -= 1; },
        }

    }

);

export const { increment, decrement } = counterSlice.actions;


const store = configureStore(
    {
        reducer: {
            counter: counterSlice.reducer,
        },
    }
);

export default store;