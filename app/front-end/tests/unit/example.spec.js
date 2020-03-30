import { mount } from '@vue/test-utils'
import ExampleComponent from '@/components/Example.vue'

test('Correct rendering for Example Component', () => {
  const cmp = mount(ExampleComponent, {
    propsData: {
      message: 'Example'
    }
  })
  expect(cmp.props().message).toBe('Example')
})
